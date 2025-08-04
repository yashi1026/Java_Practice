 Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }