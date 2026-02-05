# Mini Store — UI Notes (v0)

## Routes

- `/login` — login/register
- `/products` — product list
- `/products/:id` — product details
- `/checkout` — cart + order creation + simulated payment
- `/orders` — my orders (list)
- `/orders/:id` — order details
- `/admin/products` — admin product CRUD (ADMIN only)
- `/` — redirect to `/products`

## Global UI rules

- If not authenticated:
  - user can browse products
  - checkout requires login (redirect to `/login`)
- If authenticated (USER):
  - can create orders, pay (simulated), view own orders
- If ADMIN:
  - can access `/admin/products`

## Wireframes (ASCII)

### 1) Login / Register (`/login`)

+--------------------------------------------------+
| Mini Store |
+--------------------------------------------------+
| [ Login ] [ Register ] |
| |
| Email: [________________________] |
| Password: [________________________] |
| |
| (Login/Register Button) |
| |
| Error message area |
+--------------------------------------------------+

### 2) Product list (`/products`)

+--------------------------------------------------+
| Mini Store [Cart: 2] [Login] |
+--------------------------------------------------+
| Products |
| ------------------------------------------------ |
| (Card) Red Mug €12.50 Stock: 5 [View] |
| (Card) Blue Mug €10.00 Stock: 0 [View] |
| ... |
+--------------------------------------------------+

Product details (`/products/:id`)
+--------------------------------------------------+
| < Back to products |
| Red Mug |
| Price: €12.50 |
| Stock: 5 |
| Qty: [ 1 ] [Add to cart] |
+--------------------------------------------------+

### 3) Checkout (`/checkout`)

+--------------------------------------------------+
| Checkout |
+--------------------------------------------------+
| Cart items |
| - Red Mug €12.50 Qty [2] [Remove] |
| - Blue Mug €10.00 Qty [1] [Remove] |
| |
| Total: €35.00 |
| |
| [Create Order] |
| |
| If order CREATED: |
| Order #8421 status: CREATED |
| [Pay (Simulated)] |
| |
| If PAID: show confirmation |
+--------------------------------------------------+

## Minimal components (Angular)

- `NavbarComponent` (links + auth state)
- `LoginComponent`
- `ProductListComponent`
- `ProductDetailComponent`
- `CheckoutComponent`
- `OrdersListComponent`
- `OrderDetailComponent`
- `AdminProductsComponent`

## UX shortcuts (keep it minimal)

- Cart stored in `localStorage`
