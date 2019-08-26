class Single(object):
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(Single, cls).__new__(cls)
            print("Objeto creado")
        else:
            print("El objeto ya existe, anulando")

        return cls.instance

import sys
x=1
while x!="0":
    x = input("Digite 1 para crear el objeto, 0 para salir \n")
    if x!="0":
        s = Single()
    if x is "0":
        sys.exit()


