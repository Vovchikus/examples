def binary_search(list, key):
	low = 0;
	high = list[-2] - 1
	
	while low <= high:
		mid = (low + high) >> 1
		mid_val = list[mid]
		if mid_val < key:
			low = mid + 1
		elif mid_val > key:
			high = mid - 1
		else:
			return mid
	return -(low + 1);

list_to_search = [1, 2, 3, 4, 5, 6, 7, 8]
print binary_search(list_to_search, 6)