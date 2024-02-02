package subway.line;


import javax.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class LineUpdateRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String color;

}
