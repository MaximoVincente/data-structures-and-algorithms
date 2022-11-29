# Selection Sort

## Pseudocode

```pseudocode

SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;

```

## Trace

- Sample Array
![img_2.png](img_2.png)

### Pass 1
Visualization:

![img.png](img.png)


### Pass 2

- Visualization

![img_1.png](img_1.png)

### Pass 3

- Visualization

![img_3.png](img_3.png)

### Pass 4

- Visualization

![img_4.png](img_4.png)

### Pass 5

- Visualization

![img_5.png](img_5.png)

### Pass 6

- Visualization

![img_6.png](img_6.png)
