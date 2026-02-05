# Mini Store — SPEC (v0)

## Goal

A user can buy a product online (simulated payment).

## Actors

- Visitor: browses products
- Customer: registers, logs in, places an order, pays (simulated), views orders
- Admin: manages the product catalog

## Happy path

1. Visitor opens product list
2. Adds a product to the cart
3. Logs in / registers
4. Checkout creates an order (CREATED)
5. Simulated payment marks the order as PAID
6. User sees confirmation + order details

## MVP business rules

- Price is frozen at order time (OrderItem.unitPrice).
- Stock cannot go negative (reject order if insufficient stock).
- PAID orders are immutable (no item changes).

## Out of scope

- Real payment integration (Stripe/PayPal), refunds, invoicing
- Advanced inventory (reservations, restocking flows)
- Coupons/promos, multi-currency, shipping carriers
- Real emails (local logging only)

## Minimal data model

- Product: id, name, price, stock
- User: id, email, passwordHash, role (USER/ADMIN)
- Order: id, userId, status (CREATED/PAID), total, createdAt
- OrderItem: id, orderId, productId, quantity, unitPrice

## Risks / attention points

- JWT auth + CORS (Angular ↔ Spring)
- DB migrations (Flyway)
- Deployment: env vars + HTTPS

## Definition of Done

See README.md (checklist).
