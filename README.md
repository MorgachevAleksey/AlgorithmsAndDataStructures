Проект призван структуризовать решения алгоритмических задач

Темы представлены в порядке изучения.
Каждая тема изучается последовательно: теория → ручная реализация → задачи.
Реализации и разборы добавляются только после проработки темы.

---

Структура проекта:

1. Сортировки
   - Слиянием 
   `src/main/java/com/morgachev/aleksey/algo/l01_sorts/mergeSort`
     - `T0_MergeSortTheory.md`
     - `T1_Merge.java`
     - `T2_LeetCode_88.java`
     - `T2S_LeetCode_88.md`
     - `T3_MergeSort.java`
     - `T4_LeetCode_912.java`
     - `T4S_LeetCode_912.md`
     - `T5_LeetCode_21.java`
     - `T5S_LeetCode_21.md`
     - `T6_LeetCode_148.java`
     - `T6S_LeetCode_148.md`
   - Быстрая
   `src/main/java/com/morgachev/aleksey/algo/l01_sorts/quickSort`

2. Массивы и хеши
   - Два указателя
   `src/main/java/com/morgachev/aleksey/algo/l02_arrays_hashing/twoPointers`
     - `T0_TwoPointersTheory.md`
     - `T1_Reverse.java`
     - `T2_LeetCode_344.java`
     - `T2S_LeetCode_344.md`
     - `T3_PalindromeCheck.java`
     - `T4_LeetCode_125.java`
     - `T4S_LeetCode_125.md`
     - `T5_LeetCode_680.java`
     - `T5S_LeetCode_680.md`
     - `T6_LeetCode_167.java`
     - `T6S_LeetCode_167.md`
     - `T7_LeetCode_15.java`
     - `T7S_LeetCode_15.md`
     - `T8_LeetCode_16.java`
     - `T8S_LeetCode_16.md`
   
   - Скользящее окно
   `src/main/java/com/morgachev/aleksey/algo/l02_arrays_hashing/slidingWindow`
   
3. Связные списки
   `src/main/java/com/morgachev/aleksey/algo/l03_linkedLists`

4. Бинарный поиск
   `src/main/java/com/morgachev/aleksey/algo/l04_binarySearch`

5. Стэк и очередь
   `src/main/java/com/morgachev/aleksey/algo/l05_stacksAndQueues`

6. Деревья
`src/main/java/com/morgachev/aleksey/algo/l06_trees`
    - `T0_TreesTheory.md`
    - `T1_TreeNode.java`
    - `T2_LeetCode_104.java`
    - `T2S_LeetCode_104.md`
    - `T3_LeetCode_144.java`
    - `T3S_LeetCode_144.md`
    - `T4_LeetCode_94.java`
    - `T4S_LeetCode_94.md`
    - `T5_LeetCode_145.java`
    - `T5S_LeetCode_145.md`

7. Графы
   `src/main/java/com/morgachev/aleksey/algo/l07_graphs`

8. Динамическое программирование
   - Алгоритм Кадана
     `src/main/java/com/morgachev/aleksey/algo/l08_dynamicProgramming/kadanes`
   - Задача о рюкзаке
     `src/main/java/com/morgachev/aleksey/algo/l08_dynamicProgramming/knapsack`

Также представлены решения задач по Java с сайта CodeWars
`src/main/java/com/morgachev/aleksey/algo/l00_codeWarsTasks`
- `T1_HelloWorld.java`
- `T1S_HelloWorld.md`
- `T2_ObjectInArray.java`
- `T2S_ObjectInArray.md`
- `T3_ArrayAverage.java`
- `T3S_ArrayAverage.md`
- `T4_ReturnMessage.java`
- `T4S_ReturnMessage.md`
- `T5_ReturnStringNumber.java`
- `T5S_ReturnStringNumber.md`
- `T6_SurfaceAreaAndVolume.java`
- `T6S_SurfaceAreaAndVolume.md`
- `T7_FirstNonConsecutive.java`
- `T7S_FirstNonConsecutive.md`
- `T8_EvenCheck.java`
- `T8S_EvenCheck.md`

---

Технологии:
- Java 21
- Gradle (Kotlin DSL)
- JUnit 5

---

Запуск :
```bash
./gradlew build
```