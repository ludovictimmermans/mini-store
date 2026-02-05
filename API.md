# Mini Store — API Contract (v0)

Base URL: `/api`

---

## Auth

### Register

POST `/api/auth/register`

Request:

```json
{
  "email": "user@example.com",
  "password": "Password123!"
}

Response (200):
{
  "token": "jwt...",
  "user": {
    "id": 1,
    "email": "user@example.com",
    "role": "USER"
  }
}

Login

POST /api/auth/login

Request:

{
  "email": "user@example.com",
  "password": "Password123!"
}


Response (200): same as register.

Products
List products

GET /api/products

Response (200):

[
  { "id": 10, "name": "Red Mug", "price": 12.50, "stock": 5 },
  { "id": 11, "name": "Blue Mug", "price": 10.00, "stock": 0 }
]

Product details

GET /api/products/{id}

Response (200):

{
  "id": 10,
  "name": "Red Mug",
  "price": 12.50,
  "stock": 5
}

Orders

Order status: CREATED | PAID

Create order (from cart)

POST /api/orders

Auth: USER

Request:

{
  "items": [
    { "productId": 10, "quantity": 2 },
    { "productId": 11, "quantity": 1 }
  ]
}


Rules:

reject if product does not exist

reject if stock is insufficient

freeze unit price at order creation

Response (201):

{
  "id": 8421,
  "status": "CREATED",
  "total": 35.00,
  "createdAt": "2026-02-05T10:12:00Z",
  "items": [
    {
      "productId": 10,
      "name": "Red Mug",
      "quantity": 2,
      "unitPrice": 12.50
    },
    {
      "productId": 11,
      "name": "Blue Mug",
      "quantity": 1,
      "unitPrice": 10.00
    }
  ]
}

Get my orders

GET /api/orders

Auth: USER

Response (200): array of order summaries.

Get my order by id

GET /api/orders/{id}

Auth:

USER (must own order)

ADMIN

Simulated payment

POST /api/orders/{id}/pay

Auth:

USER (must own order)

ADMIN

Rules:

if already PAID → 409 CONFLICT

after payment → status becomes PAID

Response (200):

{
  "id": 8421,
  "status": "PAID"
}

Admin — Products

Auth: ADMIN

Create product

POST /api/admin/products

Request:

{
  "name": "Green Mug",
  "price": 9.99,
  "stock": 10
}

Update product

PUT /api/admin/products/{id}

Delete product

DELETE /api/admin/products/{id}

Conventions
Auth header

All protected endpoints must include:

Authorization: Bearer <JWT>

Error format (example)
{
  "error": "OUT_OF_STOCK",
  "message": "Insufficient stock for productId=11"
}


Suggested HTTP status codes:

400 — validation error

401 — unauthenticated

403 — forbidden

404 — not found

409 — conflict
```
