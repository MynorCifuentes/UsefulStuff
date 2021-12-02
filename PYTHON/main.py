names = ['Juan', 'Karla', 'Ricado', 'Maria']
# Imprime la lista completa
print(names)
# accede a los elementos de manera inversa
print(names[-1])
print(names[-2])
# Imprime un rango
print(names[1:3])  # sin incluir el índice 3
# Ir del inicio de la lista al índice (sin incluirlo)
print(names[:3])
# Desde el índice indicado hasta el final
print(names[1:])
# Cambiar un valor
names[3] = 'Ivone'
print(names)
# Iterar una lista
for name in names:
    print(name)
# Preguntar largo lista
print(len(names))
# Agregar un elemento
names.append('Mynor')
print(names)
# Agregar un elemento en un índice en específico
names.insert(1, 'Octavio')
print(names)
# Remover un elemento
names.remove('Octavio')
print(names)
# Remover último valor agregado
names.pop()
print(names)
# Remover un indice
del names[0]
print(names)
# Limpiar la lista
names.clear()
print(names)

# Borrar por completo
del names
print(names)