# Event-Driven Order Processing System

## Overview
Backend system built with Java 17 and Spring Boot, designed to process orders using an event-driven architecture.  
The system focuses on scalability, fault tolerance, and eventual consistency using Kafka-based messaging and Saga patterns.

---

## Architecture
- Java 17 + Spring Boot
- Hexagonal Architecture
- Kafka for event streaming
- PostgreSQL
- Docker & Kubernetes
- Observability with Prometheus and OpenTelemetry

---

## Epics & Backlog

### Epic 1 — Foundation & Architecture
**Goal:** Establish a production-ready base architecture.

- **US-01:** Bootstrap Spring Boot project with Docker support
- **US-02:** Implement Hexagonal Architecture (Ports & Adapters)

---

### Epic 2 — Order Management
- **US-03:** Create Order API (POST /orders)
- **US-04:** Publish `OrderCreated` event to Kafka

---

### Epic 3 — Inventory Reservation
- **US-05:** Consume `OrderCreated` and reserve inventory
- **US-06:** Publish `InventoryFailed` event on failure

---

### Epic 4 — Payment Processing
- **US-07:** Simulate payment gateway integration
- **US-08:** Retry strategy with exponential backoff and DLQ

---

### Epic 5 — Saga Orchestration
- **US-09:** Confirm order when all steps succeed
- **US-10:** Compensating transactions on failure

---

### Epic 6 — Observability
- **US-11:** Metrics with Micrometer + Prometheus
- **US-12:** Distributed tracing with OpenTelemetry

---

## Key Concepts Demonstrated
- Event-driven architecture
- Saga pattern
- Idempotent consumers
- Resilience & fault tolerance
- Distributed tracing
