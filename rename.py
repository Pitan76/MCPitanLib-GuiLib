import glob
import os

BEFORE = 'examplemod'
AFTER = 'mplguilib'

def rename(dirname):
    for filename in glob.glob(dirname + '/*'):
        tmp_name = filename

        if BEFORE in filename:
            new_filename = filename.replace(BEFORE, AFTER)
            os.rename(filename, new_filename)
            print(f'{filename} -> {new_filename}')
            tmp_name = new_filename

        if os.path.isdir(tmp_name):
            rename(tmp_name)

rename(os.path.dirname(os.path.abspath(__file__)))
