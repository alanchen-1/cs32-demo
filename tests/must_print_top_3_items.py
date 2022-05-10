# A small example predicate that checks if our call to shuffle_top_3
# produced the expected output
# (exactly 17, 18, 32 in some order)

import sys

x = None
try:
    x = list(map(int, sys.argv[1].split()))
except:
    exit(1)

x.sort()
if (x != [17, 18, 32]):
    exit(1)

exit(0)
