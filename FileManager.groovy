class FileManager {
    Logger logger = new Logger()  // Instanciamos la clase Logger para usarla

    // Método que procesa el archivo especificado
    def processFile(String fileName) {
        logger.log("Iniciando procesamiento del archivo: $fileName")

        // Leer el archivo
        def lines = new File(fileName).readLines()
        logger.log("Archivo $fileName leído con éxito.")

        // Transformación funcional: en este caso, convertir a mayúsculas
        def transformedLines = lines.collect { it.toUpperCase() }
        logger.log("Contenido transformado.")

        // Escribir el contenido transformado en un nuevo archivo con prefijo "copy_"
        def newFileName = "copy_$fileName"
        new File(newFileName).write(transformedLines.join("\n"))
        logger.log("Archivo transformado escrito en $newFileName.")
    }
}
