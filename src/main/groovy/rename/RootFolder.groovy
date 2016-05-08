package rename

class RootFolder {
    static File ROOT_FOLDER = 'C:/Rename' as File
    static File[] SORTED_FILES = ROOT_FOLDER.listFiles().sort()

    //TODO find a prettier solution
    static List FILE_NAMES_AS_LIST() {
        def list = []
        for (file in SORTED_FILES) {
            list += file.name.toString()
        }
        list
    }
}