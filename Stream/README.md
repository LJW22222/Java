# Stream
Java의 `Stream`은 데이터를 처리하는데 사용되는 연속된 요소의 시퀀스를 나타내는 기능입니다.  
이는 컬렉션, 배열, 파일 등과 같은 데이터 소스에서 간편하게 연속된 요소를 처리할 수 있는 방법을 제공합니다.  

비유적으로 설명하면, `Stream`은 마치 택배 박스에서 일일이 물건을 꺼내는 대신에 박스를 열어두고 필요한 조건에 따라 선택하여 사용하는 것과 유사합니다.<br/>

하지만 무작정 Stream을 쓰는 것 보다는 현재 상황에 맞게 쓰면 됩니다.
데이터 양이 많지 않거나, 간단한 로직이면 반복문을 쓰는게 더 나을 수 있습니다.  

하지만 대용량 데이터이거나, 로직이 복잡하면 Stream을 쓰는게 더 좋습니다.
Stream을 쓰면 가독성이 더 좋아지고, 성능이 더 좋아지는 이점이 있습니다.

예시 : [stream.java](./stream.java)  
데이터를 많이 받아올때 의 기준은
약 10,000,000개의 데이터를 받아오고, 이중에서 짝수만 골라내서 제곱하여 List에 다시 추가하는 로직을 8번정도 반복하여 평균적으로 걸리는 시간을 추출하는 로직을 담고 있습니다.

로직의 처리시간을 측정 했을 때 다음과 같았습니다.  
```java
More Data_Average Stream Time: 193 milliseconds  
More Data_Average For Loop Time: 229 milliseconds  
Less Data_Average Stream Time: 31 milliseconds  
Less Data_Average For Loop Time: 1 milliseconds  
```

데이터가 많은 경우에는 Stream을 쓰는 경우가 좀 더 빨랐습니다.  

하지만 데이터가 500,000인 경우에는, 확실히 For문을 쓰는 경우가 훨씬 더 빠르다는 사실을 알 수 있습니다.

이처럼 예시코드의 결과만 보아도 대용량의 데이터의 경우 이점을 한눈에 볼 수 있습니다.