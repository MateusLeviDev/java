package RandomCodeExamples.nvoip1.test;

import java.util.List;

public class UserDTO {
    private String number;
    private List<String> numbersip;

    public UserDTO(String number, List<String> numbersip) {
        this.number = number;
        this.numbersip = numbersip;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getNumbersip() {
        return numbersip;
    }

    public void setNumbersip(List<String> numbersip) {
        this.numbersip = numbersip;
    }
}
