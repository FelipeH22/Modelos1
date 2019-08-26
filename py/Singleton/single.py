class Single(object):
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(Single, cls).__new__(cls)

        return cls.instance


