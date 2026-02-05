# Mini Store

A minimal Spring Boot + Angular project to practice the full solo-dev lifecycle:
requirements → design → implementation → tests → observability → deployment.

## Docs

- `SPEC.md` — MVP scope, rules, and out-of-scope list

## Status

## Definition of Done (MVP)

- [ ] Repository contains `SPEC.md` and this checklist
- [ ] Backend (Spring Boot) starts and exposes `/actuator/health`
- [ ] Frontend (Angular) starts and can reach the backend API
- [ ] JWT auth: register, login, logout (token removal)
- [ ] Products: list + details
- [ ] Cart: add/remove/update quantities (frontend state)
- [ ] Orders: create order from cart (validates stock, freezes price)
- [ ] Simulated payment: mark order as `PAID`
- [ ] Rule enforced: `PAID` orders are immutable
- [ ] Admin: CRUD products (ADMIN role only)
- [ ] DB migrations run automatically (Flyway)
- [ ] Basic error handling returns meaningful HTTP status codes
- [ ] Basic structured logs include `requestId` and key ids (`userId`, `orderId`) when relevant
- [ ] CI runs on push (build + tests for backend, build for frontend)
- [ ] Production deployment: HTTPS URL + Postgres + env vars configured
- [ ] Uptime monitoring is enabled for the public URL and/or `/actuator/health`
- [ ] README documents local run + required env vars
