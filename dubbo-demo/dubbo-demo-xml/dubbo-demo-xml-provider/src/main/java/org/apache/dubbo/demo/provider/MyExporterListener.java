package org.apache.dubbo.demo.provider;

import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.ExporterListener;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 *
 * @author jingf
 * @version 1.0
 * @date 2:43 下午 16/12/2020
 */
public class MyExporterListener implements ExporterListener {
    /**
     * The exporter exported.
     *
     * @param exporter
     * @throws RpcException
     * @see Protocol#export(Invoker)
     */
    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        System.out.println(exporter);
    }

    /**
     * The exporter unexported.
     *
     * @param exporter
     * @throws RpcException
     * @see Exporter#unexport()
     */
    @Override
    public void unexported(Exporter<?> exporter) {
        System.out.println(exporter);
    }
}
