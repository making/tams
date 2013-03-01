-- MASTER
insert into role (role_name, created_at, updated_at, version) values ('USER', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', 0)
insert into role (role_name, created_at, updated_at, version) values ('ADMIN', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', 0)

-- USER1
insert into account (account_id, first_name, last_name, birth_date, account_status, user_id, email, password, password_status, password_updated_at, created_at, updated_at, version) values ('4b4394663d2a4505b27e63beaa417aff', 'Taro', 'Yamada', '1980-01-01', 'ACTIVATED', 'u00001', 'foo@example.com', 'xxxx', 'ACTIVATED', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', 0)
insert into account_roles (account, roles) values ('4b4394663d2a4505b27e63beaa417aff', 'ADMIN')
insert into account_roles (account, roles) values ('4b4394663d2a4505b27e63beaa417aff', 'USER')
-- USER2
insert into account (account_id, first_name, last_name, birth_date, account_status, user_id, email, password, password_status, password_updated_at, created_at, updated_at, version) values ('18a2e26a698546d6bbc13c5fb65eabcb', 'Ichiro', 'Suzuki', '1980-01-01', 'ACTIVATED', 'u00002', 'bar@example.com','xxxx', 'ACTIVATED', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', '2013-02-26 23:09:22.248', 0)
insert into account_roles (account, roles) values ('18a2e26a698546d6bbc13c5fb65eabcb', 'ADMIN')
insert into account_roles (account, roles) values ('18a2e26a698546d6bbc13c5fb65eabcb', 'USER')

commit