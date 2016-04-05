def isAnagram(s1, s2):
	l1 = list(s1)
	l2 = list(s2)
	match = [(el) for el in l1 if el in l2]
	if(len(l1) != len(l2) or len(match) == 0 or len(match) != len(l1)):
		return False
	return True

def isAnagrammSorted(s1, s2):
	l1 = sorted(list(s1))
	l2 = sorted(list(s2))
	if(len(l1) != len(l2)):
		return False
	for i, v in zip(l1, l2):
		if i != v:
			return False 
	return True

print(isAnagrammSorted('appleb','pleap'))