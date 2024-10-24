# play_with_number
---
## 🛠️ Tool : <img alt="Java" src ="https://img.shields.io/badge/Java-007396.svg?&style=for-the-badge&logo=Java&logoColor=white"/>  <img alt="Java" src ="https://img.shields.io/badge/intellijidea-000000.svg?&style=for-the-badge&logo=intellijidea&logoColor=white"/>
---
## 🥅 period : 2024/10/21 ~ 2024/10/24
--- 
## 👨‍💻 About Project 

### Level 1 
- out
   -  자리값과 숫자 모두 다를 경우 아웃 처리 

- Ball
    - 루프를 통해 number와 guess number의 idx 값을 비교, 
      같은 숫자지만 자리수가 다를경우 ball count ++
      
- Strike
    - 루프를 통해 입력값과 정답값을 비교, 같은자리 같은 숫자일 경우
      StikeCount ++
      
- PlayMain
    -  MakeResult에서 3자리 수를 미리 생성
       while문을 통해 숫자를 입력
       Set 함수를 활용해 입력 값이 중복 값인지 확인
       숫자가 아닌 문자가 입력되었는지 확인
       strike와 ball 클래스를 가져와 값을 계산해 사용자에게 보여줌
       정답일 경우 finish를 true로 변경해 loop를 탈출!
       
- MakeResult
    - 결과 값을 미리 만들기 위한 기능
      단 중복이 되면 안되기 때문에 Set 함수 사용
      숫자를 random하게 1 ~ 9 사이에 생성

### Level 2 
- out
   -  자리값과 숫자 모두 다를 경우 아웃 처리 

- Ball
    - 루프를 통해 number와 guess number의 idx 값을 비교, 
      같은 숫자지만 자리수가 다를경우 ball count ++
      
- Strike
    - 루프를 통해 입력값과 정답값을 비교, 같은자리 같은 숫자일 경우
      StikeCount ++
      
- PlayMain
    -  MakeResult에서 3자리 수를 미리 생성
       while문을 통해 숫자를 입력
       Set 함수를 활용해 입력 값이 중복 값인지 확인
       숫자가 아닌 문자가 입력되었는지 확인
       strike와 ball 클래스를 가져와 값을 계산해 사용자에게 보여줌
       정답일 경우 finish를 true로 변경해 loop를 탈출!
       
- MakeResult
    - 결과 값을 미리 만들기 위한 기능
      단 중복이 되면 안되기 때문에 Set 함수 사용
      숫자를 random하게 1 ~ 9 사이에 생성

- PlayMenu
    - 사용자가 1, 2, 3번중 선택해 해당 기능을 실행
    - 1번 입력시 게임을 진행
    - 2번 입력시 게임 결과를 보기위한 기능이지만 해당 기능은 지원하지 않는다는 결과 값을 보여준 뒤 다시 입력
    - 3번 Exit

### Level 3
- out
   -  자리값과 숫자 모두 다를 경우 아웃 처리 

- Ball
    - 루프를 통해 number와 guess number의 idx 값을 비교, 
      같은 숫자지만 자리수가 다를경우 ball count ++
      
- Strike
    - 루프를 통해 입력값과 정답값을 비교, 같은자리 같은 숫자일 경우
      StikeCount ++
      
- PlayMain
    -  MakeResult에서 3자리 수를 미리 생성
       while문을 통해 숫자를 입력
       Set 함수를 활용해 입력 값이 중복 값인지 확인
       숫자가 아닌 문자가 입력되었는지 확인
       strike와 ball 클래스를 가져와 값을 계산해 사용자에게 보여줌
       정답을 위해 몇번 시도 했는지에 대한 값을 저장. 
       정답일 경우 finish를 true로 변경해 loop를 탈출!
       
- MakeResult
    - 결과 값을 미리 만들기 위한 기능
      단 중복이 되면 안되기 때문에 Set 함수 사용
      숫자를 random하게 1 ~ 9 사이에 생성

- PlayMenu
    - 사용자가 1, 2, 3번중 선택해 해당 기능을 실행
    - 1번 입력시 게임을 진행
    - 2번 입력시 결과 몇번 시도에 결과 나왔는지 보여준다. 
    - 3번 Exit
      
- GameRecords
    - List에 결과 값 저장
    - 결과 값이 없을 경우 결과 값이 없다는 문구를 보여줌
    - 아닐경우 사용자가 정답을 맞추기 위해 몇번 시도 했는지 보여준다.
 
### Level 4
- out
   -  자리값과 숫자 모두 다를 경우 아웃 처리 

  - Ball
    - 루프를 통해 number와 guess number의 idx 값을 비교, 
      같은 숫자지만 자리수가 다를경우 ball count ++
      
- Strike
    - 루프를 통해 입력값과 정답값을 비교, 같은자리 같은 숫자일 경우
      StikeCount ++
      
- PlayMain
    -  정답인 수를 입력 받은 자리수 만큼 생성. 
       while문을 통해 숫자를 입력
       Set 함수를 활용해 입력 값이 중복 값인지 확인
       숫자가 아닌 문자가 입력되었는지 확인
       strike와 ball 클래스를 가져와 값을 계산해 사용자에게 보여줌
       정답을 위해 몇번 시도 했는지에 대한 값을 저장. 
       정답일 경우 finish를 true로 변경해 loop를 탈출!
       
- MakeResult
    - 결과 값을 미리 만들기 위한 기능
      단 중복이 되면 안되기 때문에 Set 함수 사용
      숫자를 random하게 1 ~ 9 사이에 생성

- PlayMenu
    - 사용자가 1, 2, 3번중 선택해 해당 기능을 실행
    - 1번 입력시 게임을 진행
        - 게임 진행 전에 3 ~ 5자리중 원하는 자리수 입력 할 수 있게 함 
    - 2번 입력시 결과 몇번 시도에 결과 나왔는지 보여준다. 
    - 3번 Exit
      
- GameRecords
    - List에 결과 값 저장
    - 결과 값이 없을 경우 결과 값이 없다는 문구를 보여줌
    - 아닐경우 사용자가 정답을 맞추기 위해 몇번 시도 했는지 보여준다.
  ---
  
## 🥵 TroubleShooting
- 큐에 대한 고민
ball 과 strike를 처리할때 값을 바로바로 비교해야 겠다고 생각해 FIFO 구조를 생각했다. 
하지만 다시 생각해보면 FIFO 구조가 들어가지 않는 다는 것을 알았고 배열로 문제를 해결했다
```
public static int isBall(int[] numbers, int[] guessNumber) {
    Queue<Integer> numberQueue = new LinkedList<>();
    Queue<Integer> guessQueue = new LinkedList<>();

    for (Integer number : numbers) {
        numberQueue.add(number);
    }
    for (Integer guess : guessNumber) {
        guessQueue.add(guess);
    }

    // 잘못된 방식으로 비교
    return isBallFlag(numberQueue, guessQueue);
}
```
그냥 for문을 두번 돌려서 해결했다. 

- 중복 없는 랜덤 숫자 생성 문제
```
public static int[] resultNumber() {
    Random random = new Random();
    List<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < RANDOM_SEED; i++) {
        int number = random.nextInt(MAX_NUMBER) + 1;
        numberList.add(number);  // 중복 방지되지 않음
    }
    return numberList.stream().mapToInt(i -> i).toArray();
}
```
작성하다 보니 입력 값에는 중복이 허용이 안되는데 정답값에는 중복이 있었다. 그러면 값을 절대로 해결 할 수 없다는 것을 알았고,
Set 함수를 사용해 중복을 해결했다. 

- 배열 출력에서 숫자만 출력 문제
 배열 전체가 [1, 2, 3] 형태로 출력 되는 문제가 있었다. 
```
System.out.println(Arrays.toString(randomResultNumber));
```
iterator를 사용해 배열을 없애고 단순 숫자만 출력 

- 스트라이크 계산 로직 문제
```
public static int isStrike(int[] numbers, int[] guessNumber) {
    int strikeCount = 0;
    // 잘못된 비교 로직
    if (Arrays.equals(numbers, guessNumber)) {  
        strikeCount = numbers.length;
    }
    return strikeCount;
}
```
배열 전체가 동일한 경우만 스트라이크로 간주하고, 각 자리별로 비교하지 않았음 
```
public static int isStrike(int[] numbers, int[] guessNumber) {
    int strikeCount = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == guessNumber[i]) {  // 각 자리를 비교하여 스트라이크 계산
            strikeCount++;
        }
    }
    return strikeCount;
}
```
각 자리 비교해서 같은 자리에 같은 수 있을 경우 스트라이크로 간주 

- 숫자 입력시 띄어쓰기 사용
숫자를 Stringd으로 변환 하여 공백을 처리후 다시 숫자로 변화해 배열에 저장
```
   String input = sc.nextLine();

 // 공백이 있는 경우에도 공백을 제거하고 처리
input = input.replace(" ", "");
 int num = Character.getNumericValue(input.charAt(i));

```
input.charAt(i)를 통해 각 문자를 하나씩 읽어 Character.getNumericValue()로 숫자 변경

---
## 📢 시도해본 것 
이 문제의 조건과는 관계가 없고, 단일 스레도로도 충분히 해결 가능 하지만, Thread를 배우고 있는 시점에 동시성 문제를 가정해서 풀어보고 싶었다.
level 4에서 게임 시도 횟수를 저장하는 로직이 있는데 level1,2,3에서는 List 함수를 사용했지만, 동시성 문제를 고려해보면 List 함수는 데이터에 값을 추가할때 동시에 같은 인덱스에 접근하려고 하면 덮어씌우거나 충돌하는 일이 발생. 따라서 Collections.synchronizedList를 사용 했다. 

<href-a>https://velog.io/@ik0605/%EB%8F%99%EC%8B%9C%EC%84%B1-%EC%BB%AC%EB%A0%89%EC%85%98</a>
--- 
## 🤨 아쉬운 점 
git commit message를 좀더 자세히 좀더 잘 활용해보고 싶다. 아직 익숙하지 않아 실수가 좀 많은 것 같다. 
