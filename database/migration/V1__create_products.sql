CREATE TABLE "products" (
  "products_id" BIGSERIAL PRIMARY KEY,
  "name" varchar,
  "sku" varchar,
  "quantity" int,
  "price_centy" BIGINT,
  "created_at" timestamp,
  "updated_at" timestamp
);