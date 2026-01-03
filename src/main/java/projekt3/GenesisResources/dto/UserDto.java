package projekt3.GenesisResources.dto;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private Integer id;
    private String name;
    private String surname;
    private String personid;
    private String uuid;

    public UserDto(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public UserDto(Integer id, String name, String surname, String personid, String uuid) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personid = personid;
        this.uuid = uuid;
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

    public String getPersonid() {
        return personid;
    }

    public String getUuid() {
        return uuid;
    }
}
