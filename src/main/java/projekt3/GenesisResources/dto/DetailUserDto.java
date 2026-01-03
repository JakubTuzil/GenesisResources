package projekt3.GenesisResources.dto;

public class DetailUserDto extends BasicUserDto {

    private String personid;
    private String uuid;

    public DetailUserDto(Integer id, String name, String surname, String personid, String uuid) {
        super(id, name, surname);
        this.personid = personid;
        this.uuid = uuid;
    }

    public String getPersonid() {
        return personid;
    }

    public String getUuid() {
        return uuid;
    }

}
