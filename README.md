https://programmer.group/docker-configures-the-master-slave-environment-of-postgresql13.html


version: '2'

services:
postgresql-master:
image: docker.io/bitnami/postgresql:14
ports:
- '5432'
volumes:
- 'postgresql_master_data:/bitnami/postgresql'
environment:
- POSTGRESQL_REPLICATION_MODE=master
- POSTGRESQL_REPLICATION_USER=repl_user
- POSTGRESQL_REPLICATION_PASSWORD=repl_password
- POSTGRESQL_USERNAME=postgres
- POSTGRESQL_PASSWORD=my_password
- POSTGRESQL_DATABASE=my_database
- ALLOW_EMPTY_PASSWORD=yes
postgresql-slave:
image: docker.io/bitnami/postgresql:14
ports:
- '5432'
depends_on:
- postgresql-master
environment:
- POSTGRESQL_REPLICATION_MODE=slave
- POSTGRESQL_REPLICATION_USER=repl_user
- POSTGRESQL_REPLICATION_PASSWORD=repl_password
- POSTGRESQL_MASTER_HOST=postgresql-master
- POSTGRESQL_PASSWORD=my_password
- POSTGRESQL_MASTER_PORT_NUMBER=5432
- ALLOW_EMPTY_PASSWORD=yes

volumes:
postgresql_master_data:
driver: local
