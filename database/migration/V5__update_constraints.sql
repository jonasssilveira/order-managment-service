ALTER TABLE "orders" ADD CONSTRAINT "fk_products_id" FOREIGN KEY ("products_id") REFERENCES "products" ("products_id");
ALTER TABLE "orders" ADD CONSTRAINT "fk_users_id" FOREIGN KEY ("users_id") REFERENCES "users" ("users_id");
ALTER TABLE "orders_products" ADD CONSTRAINT "fk_orders_product" FOREIGN KEY ("orders_id") REFERENCES "orders" ("orders_id");