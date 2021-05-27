from psycopg2 import connect
from psycopg2._psycopg import OperationalError
import os


def create_connection():
    try:
        conn = connect(
            host= os.environ.get('HOST'), #ranieridb.cyysbedq8cqc.us-east-1.rds.amazonaws.com
            database=os.environ.get('DB_NAME'), #postgres
            user=os.environ.get('DB_USERNAME'),#adam
            password=os.environ.get('DB_PASSWORD'),#gatorfan1
            port=os.environ.get('PORT')#5432
        )
        return conn
    except OperationalError as e:
        print(e)


connection = create_connection()
