package basic.additional3;

public class RoleType {
    private String roleType;
    private Role role;
    // Variation 1
    public RoleType(String roleType) {
        this.roleType = roleType;
        switch (roleType) {
            case "Admin" -> role = new Role(true, true, true, true);
            case "Viewer" -> role = new Role(true, false, false, false);
            case "Main Customer" -> role = new Role(true, true, true, false);
            case "Customer" -> role = new Role(true, false, true, false);
        }
    }

    public String getRoleType() {
        return roleType;
    }

    public Role getRole() {
        return role;
    }
}
