package hello.exception.exhandler;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ErrorResult {
    private final String code;
    private final String message;
}
