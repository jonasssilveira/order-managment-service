CREATE TABLE "users" (
  "users_id" BIGSERIAL PRIMARY KEY,
  "username" varchar,
  "phone" varchar,
  "email" varchar,
  "password" varchar,
  "created_at" timestamp,
  "updated_at" timestamp
);