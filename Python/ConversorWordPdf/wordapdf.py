import time
from tkinter import filedialog,messagebox,Frame,Button,Label,Tk,HORIZONTAL
from tkinter.ttk import Progressbar
from docx2pdf import convert
from pdf2docx import Converter

#Funcion Para Convertir de WORD a PDF
def conversorWord_Pdf(file_Docx):
    #file_Docx --> Input
    #Linea 11 es para cambiarle el .docx a .pdf
    file_Pdf=sustitucionExtension(file_Docx)#--> Output
    try:
        #El r, es para que tome los \ como un literal
        #Ejemplo: print(r"\n") resultado en pantalla= \n
        barra["value"]+=30
        framePrincipal.update_idletasks()
        convert( r"{0}".format(file_Docx),r"{0}".format(file_Pdf))
        barra["value"]+=70
        messagebox.showinfo(message="Se ha convertido con éxito",title="Éxito en conversión")
        filedialog.askopenfile(filetypes=(("Archivo en pdf","*.pdf"),("Archivo ya en pdf","*.pdf")),
                                                            title="Verificación de la conversión")
        if(barra["value"]!=0):
            for i in range(4):
                time.sleep(0.1)
                barra['value']-=25
                framePrincipal.update_idletasks()
    except:
        #print("No se pudo convertir")
        barra["value"]=0
        framePrincipal.update_idletasks()
        messagebox.showinfo(message="No se pudo convertir, revise que el archivo no esté abierto",title="Falla en conversión")

#Función Para Convertir De PDF a  Word
def conversorPdf_Word(file_Pdf):
    #file_Pdf --> Input
    file_Word=sustitucionExtension(file_Pdf)#-->Output
    try:
        barra["value"]+=30
        framePrincipal.update_idletasks()
        cv=Converter(file_Pdf)
        cv.convert(file_Word,start=0,end=None)
        cv.close()
        barra["value"]+=70
        #framePrincipal.update_idletasks()
        #parse(file_Word,file_Pdf,start=0,end=None)
        messagebox.showinfo(message="Se ha convertido con éxito",title="Éxito en conversión")
        filedialog.askopenfilename(filetypes=(("Archivo docx","*.docx"),("Archivo docx","*.docx")), 
                                                                title="Verificación de la conversión")
        if(barra["value"]!=0):
            for i in range(4):
                time.sleep(0.1)
                barra['value']-=25
                framePrincipal.update_idletasks()
    except(Exception):
        barra["value"]=0
        framePrincipal.update_idletasks()
        messagebox.showinfo(message="No se pudo convertir, revise que el archivo no esté abierto",title="Falla en conversión")


#Función para cambiar el nombre del archivo al mismo con un .pdf
def sustitucionExtension(convertido):
    if ".docx" in convertido:
        change=convertido.replace(".docx","(convertido).pdf")
    elif ".pdf" in convertido:
        change=convertido.replace(".pdf","(convertido).docx")
    return change

    
#Función para que abra el explorador de archivos
def abrirExploradorArchivos(opcion):
    if(opcion==1):
        archivo = filedialog.askopenfilename(title="Seleccionar documento .docx a convertir en .pdf", 
                                                                            filetypes=(("Archivos docx","*.docx"),
                                                                                        ("Archivos docx","*.docx")))
    elif(opcion==2):
        archivo= filedialog.askopenfilename(title="Seleccionar archivo .pdf a convertir en .docx",
                                                                            filetypes=(("Archivos PDF","*.pdf"),
                                                                                        ("Archivos PDF","*.pdf")))
    if(".docx" in archivo):
        conversorWord_Pdf(archivo)
    elif(".pdf" in archivo):
        conversorPdf_Word(archivo)



    
#Esto es para la interfaz
raizPrincipal=Tk()
raizPrincipal.title("Conversor a PDF")
#raizPrincipal.resizable(true,true)
'''El resizable es para que pueda el usuario o no redimenzionar la ventana, (estirarla a lo ancho(width)o a lo 
alto(height)), este método recibe un true o un false
raizPrincipal.geometry("720x460")#Geometry es para el tamaño de la ventana
raizPrincipal.config(bg="white")'''
raizPrincipal.resizable(False,False)

framePrincipal=Frame(raizPrincipal,width="500",height="230")
framePrincipal.config(bg="#242124")
#framePrincipal.config(cursor="hand2")

#PROGRESS BAR
barra=Progressbar(framePrincipal, orient=HORIZONTAL, length=400)
barra.place(x=40,y=70)

#BUTTON
setWord=Button(framePrincipal,text="Seleccione su archivo de tipo docx", command=lambda:abrirExploradorArchivos(1))
setWord.place(x=140,y=130)
setWord.config(justify="center")

setPdf=Button(framePrincipal,text="Seleccione su archivo de tipo pdf", command=lambda:abrirExploradorArchivos(2))
setPdf.place(x=142,y=170)
setPdf.config(justify="center")

#LABEL
titulo=Label(framePrincipal,text="CONVERSOR DE WORD A PDF Y PDF A WORD")
titulo.place(x=13,y=2)
titulo.config(font="families",justify="center")

#txtArchivo=Entry(framePrincipal)
#txtArchivo.grid(row="2",column="3")
framePrincipal.pack(fill="both")

#raizPrincipal.config(border="12")#el border es para dar tamaño al borde
#raizPrincipal.config(relief="groove")#El relief, es para dar un tipo de borde
raizPrincipal.mainloop()
