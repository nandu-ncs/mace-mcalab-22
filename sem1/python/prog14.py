d2=dict(((32,'Biby'),(53,'Nandu'),(23,'Abhi')))
print({x:d2[x] for x in sorted(d2)})
print({x:d2[x] for x in sorted (d2,reverse=True)})