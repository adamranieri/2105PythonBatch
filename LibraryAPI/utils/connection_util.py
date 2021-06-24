from psycopg2 import connect
from psycopg2._psycopg import OperationalError
import os


def create_connection():
    try:
        conn = connect(
            host= 'ranieridb.cyysbedq8cqc.us-east-1.rds.amazonaws.com',
            database='postgres',
            user= 'adam',
            password='gatorfan1',
            port='5432'
        )
        return conn
    except OperationalError as e:
        print(e)


connection = create_connection()
