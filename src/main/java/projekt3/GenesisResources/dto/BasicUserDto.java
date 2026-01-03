package projekt3.GenesisResources.dto;

public class BasicUserDto {

    private Integer id;
    private String name;
    private String surname;

    public BasicUserDto(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
