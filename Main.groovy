// Clase principal que ejecuta el programa desde la línea de comandos
class Main {
    static void main(String[] args) {
        if (args.length != 1) {
            println "Uso: groovy Main.groovy <nombre_del_fichero>"
            return
        }

        String fileName = args[0]
        FileManager fileManager = new FileManager()
        fileManager.processFile(fileName)
    }
}
