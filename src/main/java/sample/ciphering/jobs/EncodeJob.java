package sample.ciphering.jobs;

import sample.ciphering.cipherers.AES.AESCipherer;

public class EncodeJob extends Job{

    public EncodeJob(AESCipherer cipherer, byte[] data) {
        super(cipherer, data);
    }

    @Override
    protected byte[] perform() {
        return cipherer.encode(data);
    }
}
