int smallestUnusualNumber(std::string a) {
  for (int i = 0; i < a.length(); i++) {
    if (a[i] == '0')return 0;
  }
  long long sum = 0;
  long long product = 1;
  for (int i = 0; i < a.length(); i++) {
    sum += a[i] - '0';
    product *= a[i] - '0';
    if (product > INT_MAX)return 10 - (a[a.length() - 1] - '0');
  }
  if (sum > product)return 0;
  return 10 - (a[a.length() - 1] - '0');
}
