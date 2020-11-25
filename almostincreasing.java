/*
 * Author: Ogbonna Chibuoyim
 * Date Modified: 23-09-2019-15:10
 */
boolean skip(int pos, int[] arr) {
  int len = arr.length;
  for (int i = 0; i < len; i++) {
    if (i == pos) continue;
    if (i == pos - 1) {
      if ((i + 2) < len && arr[i] >= arr[i + 2])
        return false;
    } else {
      if ((i + 1) < len && arr[i] >= arr[i + 1])
        return false;
    }
  }
  return true;
}

boolean almostIncreasingSequence(int[] sequence) {
  for (int i = 1; i < sequence.length; i++)
    if (sequence[i] <= sequence[i - 1]) // skip imbalance
      return skip(i, sequence) || skip(i - 1, sequence);
  return true;
}
