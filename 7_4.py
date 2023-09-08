def make_shirt(Size, content = "I love Python"):
    print(f"Kich thuoc cua ao nay la: {Size}\nThong diep la: {content}")

make_shirt("L")
make_shirt("M")
n = input()
s = input()
#Test
# n = XXL
# s = toi yeu PTIT
make_shirt(n, s)