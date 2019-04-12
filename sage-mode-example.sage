# -*- mode: sage-shell:sage -*-

### A matrix
A = matrix(4,4, range(16));
print A

### The characteristic polynomial
f = A.charpoly()
print f

### Factors
print f.factor()
