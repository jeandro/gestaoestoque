docker run -d -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=postgres -e PGDATA=/var/lib/postgresql/data/pgdata -v /home/jeandro/postgres_data:/var/lib/postgresql/data postgres

