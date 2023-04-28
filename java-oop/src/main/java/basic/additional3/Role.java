package basic.additional3;

public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public Role(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }
    // Variation 2
    public static Role generateRole(String roleType) {
        return switch (roleType) {
            case "Admin" -> new Role(true, true, true, true);
            case "Viewer" -> new Role(true, false, false, false);
            case "Main Customer" -> new Role(true, true, true, false);
            case "Customer" -> new Role(true, false, true, false);
            default -> null;
        };
    }

    @Override
    public String toString() {
        return "Role{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}
