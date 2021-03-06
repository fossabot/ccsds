/*
 * Copyright 2018-2019 Dario Lucia (https://www.dariolucia.eu)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package eu.dariolucia.ccsds.tmtc.coding.encoder;

import eu.dariolucia.ccsds.tmtc.algorithm.RandomizerAlgorithm;
import eu.dariolucia.ccsds.tmtc.coding.IEncodingFunction;
import eu.dariolucia.ccsds.tmtc.datalink.pdu.AbstractTransferFrame;

/**
 * This functional class allows the usage of the {@link RandomizerAlgorithm}.randomizeFrameTm in expression using {@link java.util.stream.Stream}
 * objects or in {@link eu.dariolucia.ccsds.tmtc.coding.ChannelEncoder} instances.
 *
 * XXX: It could be considered redundant, since the randomizeFrameTm method can be addressed by using method references.
 * @param <T> subtype of {@link AbstractTransferFrame}, typically {@link eu.dariolucia.ccsds.tmtc.datalink.pdu.TmTransferFrame} or {@link eu.dariolucia.ccsds.tmtc.datalink.pdu.AosTransferFrame}
 */
public class TmRandomizerEncoder<T extends AbstractTransferFrame> implements IEncodingFunction<T> {

    @Override
    public byte[] apply(T original, byte[] input) {
        if(input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        RandomizerAlgorithm.randomizeFrameTm(input);

        return input;
    }
}
