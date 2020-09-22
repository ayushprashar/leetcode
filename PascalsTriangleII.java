class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        Integer[] resultArr = new Integer[rowIndex + 1];
        Arrays.fill(resultArr,0);
        resultArr[0] = 1;
        for(int i = 1; i <= rowIndex; i++)
            for(int j = i; j > 0; j--)
                resultArr[j] = resultArr[j] + resultArr[j-1];
        
        return Arrays.asList(resultArr);
    }
}