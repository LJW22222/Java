# InputStream
java에서 입력 스트림을 읽어오는 데 사용되는 최상위 추상 클래스입니다.<br/>
이 클래스는 바이트 기반 입력 스트림을 나타내며, 바이트 단위로 데이터를 읽어오는데 사용됩니다.<br/>

## 주요 하위 클래스
- FileInputStream
    - 파일로부터 바이트 단위로 데이터를 읽어오는 스트림 입니다.
- ByteArrayInputStream
    - 메모리 상의 바이트 배열로부터 데이터를 읽어오는 스트림 입니다.
- BufferedInputStream
    - 다른 입력 스트림에 대한 버퍼를 제공하여 입출력 성능을 향상 시키는 스트림 입니다.
- DataInputStream
    - 기본 자료형 데이터를 읽어오는 데 사용되는 스트림 입니다.

# OutputStream
java에서 출력 스트림을 읽어오는 데 사용되는 최상위 추상 클래스입니다.<br/>
이 클래스는 바이트 기반 입력 스트림을 나타내며, 바이트 단위로 데이터를 읽어오는데 사용됩니다.<br/>

## 주요 하위 클래스
- FileOutputStream
    - 파일로부터 바이트 단위로 데이터를 쓰는 스트림 입니다.
- ByteArrayOutputStream
    - 메모리 상의 바이트 배열로부터 데이터를 쓰는 스트림 입니다.
- BufferedOutputStream
    - 다른 출력 스트림에 대한 버퍼를 제공하여 입출력 성능을 향상 시키는 스트림 입니다.
- DataOutputStream
    - 기본 자료형 데이터를 쓰는데 사용되는 스트림 입니다.
