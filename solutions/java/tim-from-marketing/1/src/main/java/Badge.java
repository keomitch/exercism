class Badge {
    public String print(Integer id, String name, String department) {
        String departmentDisplay;
        if (department == null)
            departmentDisplay = "OWNER";
        else
            departmentDisplay = department;
        if (id == null)
            return name + " - " + departmentDisplay.toUpperCase();
        else
            return "[" + id + "] - " + name + " - " + departmentDisplay.toUpperCase();
    }
}
