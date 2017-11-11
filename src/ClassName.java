public class ClassName {
    private String name;
    private String department;

    public ClassName(String department, String name) {
        this.department = department;
        this.name = name;
    }

    /**
     * Takes className as CS1A and splits in CS and 1A
     * @param className e.g. CS1A
     */
    public ClassName(String className){
        int digitIndex = 0;

        // find the index of first number (name)
        for (int i = 0; i < className.length(); i++) {
            if (Character.isDigit(className.charAt(i))) {
                digitIndex = i;
                break;
            }
        }

        // get the first digit of name
        String firstDigit = String.valueOf(className.charAt(digitIndex));

        // split department and name
        String[] deptCode = className.split(String.valueOf(className.charAt(digitIndex)));

        department = deptCode[0];
        name = firstDigit + deptCode[1];
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
