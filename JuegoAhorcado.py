#Juego de ahorcado
print("\n\n*** BIENVENIDO AL JUEGO DE AHORCADO ***\n")
Palabra=input("Digite una palabra: ").upper()
Palabra=list(Palabra)


def isLetra():
    while True:
        try:
            Letra = input("\n\n Ingrese una letra: ").upper()
            if len(Letra) == 1 and Letra.isalpha():
                break
            else:
                print("\nSe detectó más de una letra o caracteres no alfabéticos.")
        except ValueError:
            None
    return Letra


def isLetraAdivinada(Letra, Pb_Oculta):
    if(Letra in Pb_Oculta):
        print(f"La(s) letra(s) {Letra} ya fue adivinada".upper())
        #Si la letra ya fue adivinada, no se suma cantidad de acertadas
        return True

def Ahorcado(Palabra, Intentos, Pb_Oculta, cntAcertadas):
    lgtd_Pb = len(Palabra)

    if lgtd_Pb == cntAcertadas:
        print(f"\nFELICIDADES, HAS DESCUBIERTO LA PALABRA\n {Palabra} \n")
        Intentos = -200
        return Intentos, cntAcertadas  # Salir de la función si se ha ganado

    AdivinoLetra = False
    Letra = isLetra() #Llamamos a la función para corroborar que sea una sola letra y no un número o caracter especial

    if(isLetraAdivinada(Letra, Pb_Oculta)): #Llamamos a la función para corroborar que la letra no haya sido adivinada con anterioridad
        #Imprime mensaje de la funcion
        return Intentos, cntAcertadas #Salir de la funcion si la letra ya fue adivinada
    else: #Si la letra no se ha adivinado miramos si existe en la palabra
        for i in range(len(Palabra)): #Recorremos la palabra
            if Letra in Palabra[i]: #Condicion que pregunta si la letra esta e la palabra en alguna de sus posiciones
                Pb_Oculta[i] = Letra
                cntAcertadas += 1
                AdivinoLetra = True #Si existe

    if AdivinoLetra:
        print("Correcto, has acertado una(s) letra(s)")
        print("\n", (" ").join(Pb_Oculta))
    else:
        Intentos -= 1
        print(f"Incorrecto, le quedan {Intentos} vidas")

    return Intentos, cntAcertadas


Palabra_Oculta = ['_'] * len(Palabra)
Vidas = 5
Acertadas = 0

while Vidas > 0:
    Vidas, Acertadas = Ahorcado(Palabra, Vidas, Palabra_Oculta, Acertadas) #Llamamos a la función Ahorcado
    if (Vidas == -200):  # Salir del ciclo si se ha ganado
        break
    
if(Vidas==0):
    print(f"\n\nHAS PERDIDO, LA PALABRA ERA: {Palabra}\n HAS ACERTADO {Acertadas} LETRA(S) \n")
