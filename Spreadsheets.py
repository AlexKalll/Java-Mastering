n = int(input())
for _ in range(n):
    coord = input()
    if coord[0] == 'R' and coord[1].isdigit() and 'C' in coord:
        row, col = map(int, coord[1:].split('C'))
        col_str = ''
        while col > 0:
            col -= 1
            col_str = chr(col % 26 + ord('A')) + col_str
            col //= 26
        print(col_str + str(row))
    else:
        split = 1
        while not coord[split].isdigit():
            split += 1
        col_str = coord[:split]
        row = int(coord[split:])
        col = 0
        for letter in col_str:
            col = col * 26 + ord(letter) - ord('A') + 1
        print(f"R{row}C{col}")