# solid-principles
Practicing solid principle concept

Why solid principles:

To make sure our changes dont impact others & others changes should mostly dont impact ours in future

S- Single Responsibility
O- Open Closed
L- Liskov Substitution
I- Interface Segregation
D- Dependency Inversion

S- Single Responsibility: One class should have only 1 responsibility

O- Open for extension Closed for modification

L- Derived type should be completely substitutable with Base type

I- Clients should not be forced to implement unnecessary methods which they dont use, should split interfaces to smaller & more specific ones

D- Depend on abstractions, not on concretions - Autowiring

How SOLID Helps in Real Projects
☐
Imagine your e-commerce backend: I
• ProductService, OrderService , PaymentService, etc.
By following SOLID:

SRP- - Single Responsibility Principle
"One class, one reason to change."
Your ProductService should only handle product-related operations (like adding, updating, or
fetching products).
It shouldn't send emails, log activity, or manage stock updates directly.
If all that's mixed inside, changing the email system or logging framework would force you to modify
the product logic too.
By keeping ProductService focused, your code stays clean, modular, and testable.

OCP - Open/Closed Principle
"Open for extension, closed for modification."
When your PaymentService supports one payment gateway (say Razorpay) and tomorrow
to add PayPal or Stripe - you shouldn't have to edit existing code.
Instead, you just add new payment classes.
Your system's design should allow new gateways to plug in without disturbing existing ones
This keeps your production-tested logic safe from regressions.

LSP - Liskov Substitution Principle
"Subclasses should behave like their parent types."
If you define a generic PaymentGateway type and have multiple implementations (PayPal
Razorpay), every gateway must behave consistently when used in the same way.
The order system should not care which gateway it's using — all should follow the same
processPayment() should actually process, not throw an error).
That way, replacing one gateway with another won't break your order flow.

ISP-Interface Segregation Principle
"Don't force a class to depend on methods it doesn't use."
In your system, instead of one giant interface like EcommerceService with 20 methods (addProduct,
cancelOrder, refundPayment, etc.), split it into smaller, role-based interfaces — like
ProductOperations, OrderOperations, PaymentOperations.
This way, each service only implements the functionality it actually needs - keeping your APIs and
classes clean and focused.
Now, say your ProductService implements this interface.
But ProductService doesn't need payment or order-related methods yet it is forced to implement
them (maybe leaving them blank or throwing exceptions).
That's violating ISP - the class depends on things it doesn't use.
Instead of one big EcommerceService, you create segregated interfaces:

interface ProductOperations {
void addProduct (Product p);
void deleteProduct (int id);
} I
interface OrderOperations {
void createOrder (Order o);
void cancelOrder(int id);
}
interface PaymentOperations {
void processPayment (Payment p);
void refundPayment(int id);
}

Now:
• ProductService implements only ProductOperations |
• Order Service implements only OrderOperations
• PaymentService implements only PaymentOperations
Each class deals only with what it actually needs.

DIP-Dependency Inversion Principle
"Depend on abstractions, not concrete implementations."
Your OrderService shouldn't depend directly on a specific payment class like PayPalService.
It should depend on a common interface, say IPaymentGateway.
At runtime, the actual implementation (PayPal, Stripe, Razorpay) gets injected.
This makes your code flexible, decoupled, and testable you can switch payment providers without
touching the order logic.
