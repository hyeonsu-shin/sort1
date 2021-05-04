

layout: single
title:  "SortingAlgorithms.md"
date:   2021-05-04 21:23:44 +0900

------

# 정렬 알고리즘( Sorting Sorting)

## ☆.정렬의 종류

> 1.`Selection Sort`, 2. `Bubble Sort`, 3. `Quick Sort`,4.`Insertion Sort`,5. `Shell Sort`, 6. `Merge Sort`, 7. `Heap Sort`, 8. `Radix Sort`

## ☆.실행 방법에 따른 분류

> - **비교식 정렬** 은 비교하고자 하는 각 키값들을 한 번에 두 개씩 비교하여 교환하는 방식으로 정렬을 실행하는 방법
> - **분산식 정렬** 은 키값을 기준으로 하여 자료를 여러 개의 부분 집합으로 분해하고, 각 부분 집합을 정렬함으로써 전체를 정렬하는 방식으로 실행하는 방법

## ☆.내부 정렬 (Internal sort)

> - **내부 정렬** 은 정렬할 자료를 메인 메모리에 올려서 정렬하는 방식이고 정렬 속도가 빠르지만 정렬할 수 있는 자료의 양이 메인 메모리의 용량에 따라서 제한된다.
> - **내부 정렬 방식** 에는 교환 방식(Selection, Bubble, Quick), 삽입 방식(Insertion, Shell), 병합 방식(2-way 병합, n-way 병합), 분배 방식(Radix), 선택 방식(Heap, Tree) 등이 있다.

## ☆.외부 정렬 (External sort)

> - **외부 정렬** 은 정렬할 자료를 보조 기억장치에서 정렬하는 방식이고 대용량의 보조 기억 장치를 사용하기 때문에 내부 정렬보다 속도는 떨어지지만 내부 정렬로 처리할 수 없는 대용량의 자료에 대한 정렬이 가능하다.
> - **외부 정렬 방식** 에는 **병합 방식(2-way 병합, n-way 병합)** 이 있다.

## ☆. 알고리즘 성능

> 일반적으로는 `Quick Sort`가 제일 빠르다고 알려져 있다. 최악의 경우 `n²`이 발생하는데 이는 피봇이 최소값, 최대값으로 잡히게 될 경우이다. 이를 피하기 위해서 피봇을 랜덤으로 잡거나 **Media-Of-Three Partitioning**이라는 기법을 사용한다. 평균적으로 가장 좋은 성능을 낸다.
>
> 이미 정렬되어 있는 자료의 경우에는 `Insertion Sort`가 제일 빠르다. 이미 정렬되어 있는 경우 바로 앞자리 원소와 한 번만 비교하면 되기 때문이다.
>
> 시간복잡도 :     
>
> - O(n²) : `Bubble Sort`, `Selection Sort`, `Insertion Sort`, `Shell Sort`, `Quick Sort`
> - O(n log n) : `Heap Sort`, `Merge Sort`
> - O(kn) : `Radix Sort` (`k`는 자릿수, 자릿수가 적은 4바이트 정수에서나 제대로 된 성능을 낼 수 있다는 제약조건이 있다.)

​    

------

​    

## 1. 버블정렬(BubbleSort)

![bubble](https://upload.wikimedia.org/wikipedia/commons/3/37/Bubble_sort_animation.gif)

> **인접한 두 개의 원소를 비교하여 자리를 교환하는 방식이다.**
>
> 1. 첫 번째 원소부터 마지막 원소까지 반복하여 한 단계가 끝나면 가장 큰 원소가 마지막 자리로 정렬(`Ascending`이냐 `Descending`이냐에 따라 대소 비교는 다르게 적용하면 된다).
>
>
> 1. 첫 번째 원소부터 인접한 원소끼리 계속 자리를 교환하면서, 맨 마지막 자 리로 이동하는 모습이 물속에서 물 위로 올라오는 물방울 모양과 같다고 하여 버블(Bubble) 정렬이라고 한다.

## 설명

> <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FSWnC2%2FbtqGzYnhDNi%2FfwMxKAAKkt7ih2MIlxxJBk%2Fimg.png ">
>
> 1. 가장 먼저 인접한 두 원소인 5와 3을 비교합니다.
> 2. 5와 3 중 더 큰 수를 오른쪽으로 교환하여 줍니다.
> 3. 다음 인접한 두 수인 5와 8을 비교하여 줍니다.
> 4. 5와 8 중 큰 수를 오른쪽으로 보내야 하지만 이미 8이 큰 수 이므로 교환하지 않습니다.
> 5. 다음 8과 1을 비교하여 줍니다.
> 6. 마찬가지로 두 수 중 더 큰 수를 오른쪽으로 교환해 줍니다.
> 7. 다음 8과 2를 비교하고 더 큰 수인 8과 교환이 일어납니다.
> 8. 마지막으로 8과 7을 비교하고 더 큰 수인 8과 교환이 일어납니다.
> 9. 결과적으로 가장 큰 수인 8은 리스트의 가장 끝쪽에 정렬이 됩니다.
> 10. 한 번의 반복을 통해 가장 큰 레코드가 리스트의 오른쪽 끝에 이동이 되었고, 8을 제외한 나머지를 다시 반복합니다.
>
> ​    
>
> <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Frpnk5%2FbtqGAHyxqjV%2FM7AK7dGdsGtJyYbky3eiq1%2Fimg.jpg">
>
> 
>
> 1. 다음과 같이 오른쪽 레코드의 정렬이 끝나면 n-1번째 부터 정렬을 시작한다.
> 2. 즉, 시간복잡도로 계산해본다면
> 3. 첫번째, n 개의 원소 비교
> 4. 두번째, n-1개의 원소 비교
> 5. 세번째, n-2개의 원소 비교
> 6. ...
> 7. n,n-1,n-2,...2,1번 = **n(n-1)/2**
> 8. 이는 **최악의 경우(Worst Case)**인 입력 자료가 역순인 경우 한 번 교환하기 위해 3번의 이동(Swap)이 필요하므로 (비교횟수 *3)번 = 3n(n-1)/2 이므로**시간복잡도**를 빅오로 표현해 본다면, 평균적으로 **O(N****2****)** 이 나오게 됩니다.
>
> 최상의 경우(Best Case)는 입력자료가 이미 정렬이 된 상태라면 자료의 이동이 발생하지 않으므로 **O(N)** 입니다.

## 알고리즘 특징

> - **장점**
>
> 1. 구현이 매우 간단하다.
>
> - **단점**
>
> 1. 순서에 맞지 않은 요소를 인접한 요소와 교환한다.
> 2. 하나의 요소가 가장 왼쪽에서 가장 오른쪽으로 이동하기 위해서는 배열에서 모든 다른 요소들과 교환되어야 한다.
> 3. 특히 특정 요소가 최종 정렬 위치에 이미 있는 경우라도 교환되는 일이 일어난다.
>
> - 일반적으로 자료의 교환 작업(SWAP)이 자료의 이동 작업(MOVE)보다 더 복잡하기 때문에 버블 정렬은 단순성에도 불구하고 거의 쓰이지 않는다.

​    

------

​    

## ★성능 구현

## 소스코드

> ```
> public static void main(String[] args) {
>             int[] item = new int[] { 10, 40, 50, 20, 80, 30,60,90 };
>             System.out.println("정렬 전");
>             printArray(item);
>             bubbleSort(item);
>             System.out.println("정렬 후");
>             printArray(item);
>         }
> ```

> ```
> public static void bubbleSort(int[] array) {
>         for (int i = 0; i < array.length; i++) {
>             for (int j = 0; j < array.length - i - 1; j++) {
>                 if (array[j] > array[j + 1]) {
>                     swap(array, j, j + 1);
>                 }
>             }
>         }
>     }
> ```

## 결과 값

![버블 결과](https://user-images.githubusercontent.com/80369791/117008137-5f591180-ad25-11eb-8710-a9cb36152ca4.PNG)

## 정리

> **최악의 시간복잡도도 O(N2)** 을 갖는다.    
> 인접한 값만 비교하면 되는 방식이기 때문에 **직관적이고, 구현이 매우 쉽다.**  
> **효율적인 알고리즘**에서는 사용되지 않는다.추가적인 배열을 만들 필요가 없는 메모리 측면에서 제자리 정렬 알고리즘 (in-place algorithm) 이라고 한다.   
> ***버블 정렬은 안정적(Stable) 정렬이다*.** 

------

​    

## 2. 선택정렬 (Selection Sort)

> -  **선택 정렬(Selection So)** 은 **제자리 정렬(in-place sorting) 알고리즘** 중 하나로 **주어진 리스트의 최소값을 찾아 그 값을 맨 앞으로 교체하며 정렬하는 방법**입니다.
> - **시간복잡도**가 **(N2)**  으로 상당히 느리지만, 알고리즘이 단순하며 메모리가 제한적인 경우에 사용시 성능 상의 이점이 있습니다.

## 설명

> ![selection](https://i2.wp.com/algorithms.tutorialhorizon.com/files/2019/01/Selection-Sort-Gif.gif?resize=415%2C297&ssl=1)![in](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbCUPJP%2FbtqGIhtKYq9%2FELqKiNucrWPIrd8GWKzxTk%2Fimg.png)
>
> 1. 가장 처음 인덱스인 5와 전체 배열 중 가장 작은 1의 위치를 교환합니다.
> 2. 이제 전체 배열의 첫번째 인덱스는 가장 최소값이므로, 두번째 탐색에서는 첫번째 인덱스를 제외한 숫자부터 검색을 합니다. 그림으로 확인해보면 두번째 인덱스인 5와 전체 배열 중 가장 작은 값인 2의 위치를 교환합니다.
> 3. 위와 마찬가지로 전체 배열의 두번째 인덱스는 이미 최소값이기 때문에 다음 인덱스부터 검색을 진행합니다.
> 4. 하지만 그림에서 3은 이미 올바른 위치에 있기 때문에 교환이 일어나지 않습니다.
> 5. 다음 과정들을 되풀이하여 정렬을 완료합니다.

## 알고리즘 특징

> - **장점**
>
> 1. 자료 이동 횟수가 미리 결정된다.
>
> - **단점**
>
> 1. 안정성을 만족하지 않는다.
> 2. 즉, 값이 같은 레코드가 있는 경우에 상대적인 위치가 변경될 수 있다.

​    

------

​    

## ★성능 구현

## 소스

> ```
> public static void main(String[] args) {
>         int[] item = new int[] {40,70,60,30,10,50};
>         System.out.print("선택정렬  전   : ");
>         printArray(item);
>         System.out.print("선택정렬  후   : ");
>         selectionSort(item);
>         printArray(item);
>     }
> ```

> ```
> public static void selectionSort(int[] array) {
>         for (int i = 0; i < array.length - 1; i++) {            
>             int minIndex = i;
>             for (int j = i + 1; j < array.length; j++) {
>                 if (array[j] < array[minIndex]) {
>                     minIndex = j;
>                 }
>             }
>             swap(array, minIndex, i);
>         }
>     }
> ```

## 결과 값

![선택 결과](https://user-images.githubusercontent.com/80369791/117010331-a9db8d80-ad27-11eb-82c8-a1b47e3b8397.PNG)

## 정리

> - **버블 정렬(Bubble Sort)** 과 같은 **시간 복잡도 O(N2)**  을 갖지만, 실제로는 **버블 정렬(Bubble Sort)** 에 비해 조금 더 빠르다
> - 버블 정렬과 마찬가지로 구현이 쉬운 편이다.
> - 비교 횟수는 많지만, 교환 횟수는 적기 때문에 교환이 많이 이루어져야하는 자료 상태에서 효율적이다.( 내림 차순으로 정렬된 자료 상태라면 최적이다.)
> - 이미 정렬된 상태에서 소수의 자료가 추가되면 재정렬 시 최악의 성능을 보인다.

​    

------

​    

## 3. 삽입 정렬(Insertion Sort)

> **삽입 정렬(揷入整列, Insertion Sort)** 은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, **자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘**이다.

## 설명

> ![inserting](https://media.vlpt.us/images/yujo/post/d81d42aa-08ed-40f5-a3da-d279f882436a/%EC%82%BD%EC%9E%85%EC%A0%95%EB%A0%AC%20%EC%84%A4%EB%AA%85%20%EC%A7%A4.gif)
>
> ![in](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbuodfM%2FbtqGY7Q9INs%2FXCjG7kqRKLyKeVmSZBYaQ0%2Fimg.png)
>
> 1. 삽입정렬에서는 가장 첫번째 원소는 정렬이 된 상태라고 가정을 하고 시작을 합니다. ( 이유는 원소가 1개면 10이 오든 100이 오든 이미 정렬이 끝난 상태기 때문에 )
> 2. 그렇기 때문에 두번째 원소부터 비교해 나가기 시작합니다.
> 3. 두번째 원소인 1을 왼쪽 원소들과 비교하여 올바른 위치인 5의 앞으로 위치하게 됩니다.
> 4. 다음 세번째 원소인 3보다 왼쪽 원소들을 비교하여 올바른 위치인 1과 5 사이에 위치합니다. 
> 5. 네번째 7은 이미 올바른 곳이므로 교환하지 않습니다.
> 6. 다섯번째 2보다 앞의 원소들을 비교해 올바른 자리를 찾습니다.
> 7. 이와 같은 과정들을 반복하여 정렬을 마칩니다.

## 알고리즘 특징

> - **장점**
>
> 1. 안정한 정렬 방법
> 2. 레코드의 수가 적을 경우 알고리즘 자체가 매우 간단하므로 다른 복잡한 정렬 방법보다 유리할 수 있다.
> 3. 대부분위 레코드가 이미 정렬되어 있는 경우에 매우 효율적일 수 있다.
>
> - **단점**
>
> 1. 비교적 많은 레코드들의 이동을 포함한다.
> 2. 레코드 수가 많고 레코드 크기가 클 경우에 적합하지 않다.

​    

------

​    

## ★성능 구현

## 소스코드

> ```
> public static void main(String[] args) {
>         int[] item = new int[] { 40, 10, 50, 90, 20, 80, 30, 60 };
>         System.out.println("삽입정렬 완료");
>         insertionSort(item);
>         printArray(item);
>
>     }
> ```

> ```
> public static void insertionSort(int[] array) {
>         for (int i = 1; i < array.length; i++) {
>             int key = i;
>             while (key > 0 && array[key - 1] > array[key]) {
>                 swap(array, key - 1, key);
>                 key--;
>             }
>         }
>     }
> ```

## 결과 값

> ![삽입정렬](https://user-images.githubusercontent.com/80369791/117010286-9d573500-ad27-11eb-889a-c2e2e918d372.PNG)

## 정리

> - 같은 **시간복잡도O(N2)** 를 가지는 **선택 정렬(Selection Sort)** 나 **버블 정렬(Bubble Sort)** 에 비해 빠르고, **안정(Stable) 정렬** 이며, **제자리 정렬(in-place)** 알고리즘이다.
> - 최선의 경우 이미 정렬된 상태인 시간복잡도 **O(N)** 을 가지며, **평균 및 최악은 시간복잡도** **O(N2)**을 가진다.
> - 대부분의 레코드가 이미 정렬된 상태의 경우 매우 효율적일 수 있다.
> - 레코드 수가 많고 레코드의 크기가 클 경우는 적합하지 않다.

​    

------

## 4. 셸 정렬(Shell Sort)

> - ‘Donald L. Shell’이라는 사람이 제안한 방법으로, 삽입정렬을 보완한 알고리즘이다.
> - 삽입 정렬이 어느 정도 정렬된 배열에 대해서는 대단히 빠른 것에 착안
> - 삽입 정렬의 최대 문제점: 요소들이 삽입될 때, 이웃한 위치로만 이동
> - 즉, 만약 삽입되어야 할 위치가 현재 위치에서 상당히 멀리 떨어진 곳이라면 많은 이동을 해야만 제자리로 갈 수 있다.
> - 삽입 정렬과 다르게 셸 정렬은 전체의 리스트를 한 번에 정렬하지 않는다.

## 설명

> 1. 먼저 정렬해야 할 리스트를 일정한 기준에 따라 분류
> 2. 연속적이지 않은 여러 개의 부분 리스트를 생성
> 3. 각 부분 리스트를 삽입 정렬을 이용하여 정렬
> 4. 모든 부분 리스트가 정렬되면 다시 전체 리스트를 더 적은 개수의 부분 리스트로 만든 후에 알고리즘을 반복
> 5. 위의 과정을 부분 리스트의 개수가 1이 될 때까지 반복

## 알고리즘 특징

> - **장점**
>
> 1. 연속적이지 않은 부분 리스트에서 자료의 교환이 일어나면 더 큰 거리를 이동한다. 따라서 교환되는 요소들이 삽입 정렬보다는 최종 위치에 있을 가능성이 높아진다.
> 2. 부분 리스트는 어느 정도 정렬이 된 상태이기 때문에 부분 리스트의 개수가 1이 되게 되면 셸 정렬은 기본적으로 삽입 정렬을 수행하는 것이지만 삽입 정렬보다 더욱 빠르게 수행된다.
> 3. 알고리즘이 간단하여 프로그램으로 쉽게 구현할 수 있다

​    

------



## ★성능 구현

## 소스코드

> ```
> public static void main(String[]args){
>         int[] arr = new int[]{30,60,90,10,40,80,40,20,10,60,50,30,40,90,80};
>         shellSort(arr);
>     }
> ```

> ```
>  public static void intervalSort(int[] arr, int begin, int end, int interval) {
>         int j;
>         for(int i=begin+interval;i<=end;i=i+interval) {
>             int item = arr[i];
>             for(j = i-interval;j>=begin && item<arr[j]; j=j-interval) {
>                 arr[j+interval] = arr[j];
>             }
>             arr[j+interval] = item;
>         }
>     }
> ```
>
> ```
> public static void shellSort(int[] arr) {
>         int size = arr.length;
>         int interval = size/2;
>         while (interval >=1){
>             for(int i=0;i<interval;i++) {
>                 intervalSort(arr, i, size-1, interval);
>             }
>             System.out.println("interval = "+interval);
>             for(int t=0;t<size;t++) {
>                 System.out.print(arr[t]+" ");
>             }
>             System.out.println();
>             interval = interval/2;
>         }
>     }
> ```

## 결과 값

> ![쉘 결과](https://user-images.githubusercontent.com/80369791/117011587-ef4c8a80-ad28-11eb-8ca4-c411dc797e3d.PNG)

------

​    

## 5.정렬의 시간복잡도

### 버블 정렬

> - 비교 횟수
> - 최상, 평균, 최악 모두 일정
> - n-1, n-2, … , 2, 1 번 = n(n-1)/2
> - 교환 횟수
> - 입력 자료가 역순으로 정렬되어 있는 최악의 경우, 한 번 교환하기 위하여 3번의 이동(SWAP 함수의 작업)이 필요하므로 (비교 횟수 * 3) 번 = 3n(n-1)/2
> - 입력 자료가 이미 정렬되어 있는 최상의 경우, 자료의 이동이 발생하지 않는다.
> - T(n) = O(n^2)

​    

### 선택정렬

> - 비교 횟수
> - 두 개의 for 루프의 실행 횟수
> - 외부 루프: (n-1)번
> - 내부 루프(최솟값 찾기): n-1, n-2, … , 2, 1 번
> - 교환 횟수
> - 외부 루프의 실행 횟수와 동일. 즉, 상수 시간 작업
> - 한 번 교환하기 위하여 3번의 이동(SWAP 함수의 작업)이 필요하므로 3(n-1)번
> - T(n) = (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)

​    

### 삽입정렬

> - 최선의 경우
> - 비교 횟수
> - 이동 없이 1번의 비교만 이루어진다.
> - 외부 루프: (n-1)번
> - Best T(n) = O(n)
> - 최악의 경우(입력 자료가 역순일 경우)
> - 비교 횟수
> - 외부 루프 안의 각 반복마다 i번의 비교 수행
> - 외부 루프: (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)
> - 교환 횟수
> - 외부 루프의 각 단계마다 (i+2)번의 이동 발생
> - n(n-1)/2 + 2(n-1) = (n^2+3n-4)/2 = O(n^2)
> - Worst T(n) = O(n^2)

​    

### 셸 정렬

> - 평균: T(n) = O(n^1.5)
> - 최악의 경우: T(n) = O(n^2)

​    

### 시간 복잡도 표

> ![표](https://user-images.githubusercontent.com/80369791/117015883-1dcc6480-ad2d-11eb-8f1e-5d9201992498.PNG)

------

