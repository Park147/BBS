package org.zerock.bbs.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    @Qualifier("normal")
    private final SampleDAO sampleDAO; // final 키워드로 주입할 의존성 변수 선언
}